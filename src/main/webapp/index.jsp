<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html:form action="/user">
    <input type="hidden" name="action" value="create"/>
    <div>
        Name: <html:text property="name"/>
    </div>
    <div>
        Email: <html:text property="email"/>
    </div>
    <div>
        Phone: <html:text property="phone"/>
    </div>
    <div>
        <html:submit value="Submit"/>
    </div>
</html:form>
