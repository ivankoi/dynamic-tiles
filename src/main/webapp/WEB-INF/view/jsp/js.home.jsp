<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<p>JavaScript Home Page Body</p>

JsENABLED: <c:out value="${sessionScope.jsEnabled}"/>
<spring:form action="/dynamic-tiles/">
    <input type="submit" value="toggle javascript">
</spring:form>