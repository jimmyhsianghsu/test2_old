package test;

import gov.mvdis.m3.batch.service.CoreBatchServiceClient;
import gov.mvdis.m3.batch.service.pub.ServiceMapEntry;
import gov.mvdis.m3.batch.service.pub.ServiceMapEntryArray;
import gov.mvdis.m3.vil.service.EmvViolationService;
import gov.mvdis.m3.vil.service.PolViolationService;
import gov.mvdis.m3.vil.service.pub.EmvViolationOuterObject;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceTest extends HttpServlet {
    private void setWsdlUrl(String url) {
	ResourceBundle rb = ResourceBundle.getBundle("/META-INF/bundle/wsdl");
	URL urlPol = null;
	URL urlEmv = null;
	try {
	    urlPol = new URL(rb.getString("pol." + url));
	    urlEmv = new URL(rb.getString("emv." + url));
	} catch (MalformedURLException e) {
	    e.printStackTrace();
	}
	PolViolationService.WSDL_LOCATION = urlPol;
	EmvViolationService.WSDL_LOCATION = urlEmv;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html; charset=utf8");
	setWsdlUrl(req.getParameter("url"));
	String service = req.getParameter("service");

	JSONObject jobj = new JSONObject();
	List list = null;
	try {
	    if ("PolViolationService".equals(service))
		list = new PolViolationServiceTest().resList(req);
	    else if ("EmvViolationService".equals(service))
		list = new EmvViolationServiceTest().resList(req);
	    getResList(jobj, list);
	} catch (Exception e) {
	    e.printStackTrace();
	    try {
		jobj.put("errMsg", e.getMessage());
	    } catch (JSONException e1) {
		e1.printStackTrace();
	    }
	}
	res.getWriter().println(jobj.toString());
	//System.out.println(testCoreBatchService());
    }

    private void getResList(JSONObject jobj, List list) throws JSONException, IllegalArgumentException,
	    IntrospectionException, IllegalAccessException, InvocationTargetException {
	JSONArray jArry = new JSONArray();
	if (list != null)
	    for (Object o : list)
		if (o instanceof EmvViolationOuterObject) {
		    JSONObject jobj1 = new JSONObject();
		    for (PropertyDescriptor pd : Introspector.getBeanInfo(EmvViolationOuterObject.class)
			    .getPropertyDescriptors())
			if (pd.getReadMethod() != null && !"class".equals(pd.getName())) {
			    Object o1 = pd.getReadMethod().invoke(o);
			    if (o1 instanceof List) {
				JSONArray jArry1 = new JSONArray();
				for (Object o2 : (List) o1)
				    jArry1.put(new JSONObject(o2));
				jobj1.put(pd.getName(), jArry1.toString());
			    } else
				jobj1.put(pd.getName(), o1);
			}
		    jArry.put(jobj1);
		} else
		    jArry.put(new JSONObject(o));
	jobj.put("rows", jArry);
    }

    private boolean testCoreBatchService() {
	ServiceMapEntryArray ar = new ServiceMapEntryArray();
	ServiceMapEntry en = new ServiceMapEntry();
	en.setKey("mei.file.list");
	en.setValue("file:/opt/m3fs/static/mei/POL/download/POL005-1020924-0000001/AA10206190.0.E");
	List<ServiceMapEntry> li = new ArrayList<ServiceMapEntry>();
	li.add(en);
	ar.item = li;
	return new CoreBatchServiceClient().getCoreBatchServiceImplPort().startJob("jobPOL005", "", ar);
    }
}