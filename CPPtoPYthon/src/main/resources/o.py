def iloczyn ( a , b ) :
	c = 0
	print ("Iloczyn")
	c = a * b
	
	return c
	
def foo ( param ) :
	if param == True:
		print ("foo")
	else:
		print ("falseFoo")
		
def main (  ) :
	a = 2
	b = 5
	c = 10
	d = iloczyn(b , c)
	print ( b )
	print ( d )
	while a != b:
		print ("loop")
		a += 1
		
