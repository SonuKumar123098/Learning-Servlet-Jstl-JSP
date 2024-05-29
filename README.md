### bulletin Object(can be used in Scriplet and Expression)
* request (HttpServletRequest)
* response (HttpServletResponse)
* pageContext (PageContext)
* out (JspWriter) ~PrintWrite object
* session (HttpSession)
* application (ServletContext)
* config (ServletConfig)

### Some notes about  JSP Directive has three tag
		@page  ->  importing a package, this page handles the exeption or not
		@include ->if you want to other jsp page in your jsp page you can use include
		@taglib -> library of tag, you can external tag like spring framework in you page
		
		@Page  
### directory tag
* attribute="value" attribute="value"
		* all attributes are below
		* language="scripting language" java
		* extends="classname" 
		* import="importList"
		* session="true|false"
		* autoFlush="true|false"
		* contentType="ctinfo" ->send response to client it can be html page
		* errorPage="error_url"  
		* isErrorPage="true|false"
		* info="information"
		* isELIgnored="true|false"
		* isThreadSafe="true|false"  
		
		@include 
		file="filename"
		file="header.jsp"
		
		@taglib
		uri="uri" - library
		prefix="fx" - 
		if you want to use <navin> tag, then you can use <fx:navin> </fi:navin>this means navin belong to  fx
		
		
		
