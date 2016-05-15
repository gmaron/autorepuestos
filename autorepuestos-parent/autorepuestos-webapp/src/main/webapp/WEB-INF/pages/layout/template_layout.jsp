<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Gaston Maron">

<link rel="shortcut icon" href='<c:url value="/img/favicon.ico" />' type="image/x-icon">
<link rel="icon" href='<c:url value="/img/favicon.ico" />' type="image/x-icon">

<title><tiles:getAsString name="title" /></title>


<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

</head>
<body>
	<div class="container">
        <div class="row">
            <div id="header">
                <tiles:insertAttribute name="header" />
            </div>
        </div>
        <div class="row">
            <div id="body">
                <tiles:insertAttribute name="body" />
            </div>
        </div>
            <div class="row">
            <div class="col-md-12" id="footer" style="margin-top:200px;border-top:1px solid gray">
                <tiles:insertAttribute name="footer" />
            </div>
        </div>

    </div>
</body>
</html>