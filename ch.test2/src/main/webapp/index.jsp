<html>
<head>
<!-- 	<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" /> -->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
<!-- 	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script> -->
	<style>
		#sortable { list-style-type: none; margin: 0; padding: 0; width: 50%; }
		#sortable li { margin: 0 3px 3px 3px; padding: 0.4em; padding-left: 1.5em; font-size: 1.4em; height: 18px; }
		#sortable li span { position: absolute; margin-left: -1.3em; }
	</style>
	<script>
  $(function() {
    //$( "#sortable" ).sortable().disableSelection();
  });
  function sortAdd(input){$(input).parents('li').first().after('<li class="ui-state-default"></li>');}
  var ref=[];
  
  </script>
</head>
<body>
<h2>Hello World!</h2>
<form action="Test2">
<input name="action" type="text" value="getVilRefMap" method="post"/>
<input type="submit" value="x"/>
</form>
<ul id="sortable">
  <li class="ui-state-default"><span class="ui-icon" onclick="kkk(this)"></span>Item 1</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-circle-plus"></span>Item 2</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-circle-plus"></span>Item 3</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 4</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 5</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 6</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 7</li>
</ul>
<ul>
  <li class="ui-state-default"><span class="ui-icon" onclick="kkk(this)"></span>Item 1</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-circle-plus"></span>Item 2</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-circle-plus"></span>Item 3</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 4</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 5</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 6</li>
  <li class="ui-state-default"><span class="ui-icon ui-icon-arrowthick-2-n-s"></span>Item 7</li>
</ul>
</body>
</html>
