Case1:
	If a super class method doesn't declare any exception, then subclass over-riden method cannot declare
checked exception but declare unchecked(runtime exception)

Case2:
	If a super class method throws an exception, then subclass method can throw the same exception or no exception, 
but must not throw parent exception of the exception thrown by super class method.
	For Ex: If super class method throws object of NullPointerException class, then Subclass method 
			can either throw same exception, or can throw no exception, but it can never throw object of
	 		Exception class (parent of NullPointerException class).  

Case3:

 