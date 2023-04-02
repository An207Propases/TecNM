Algoritmo CicloDowhile
	Escribir "num a ingresar"
	Leer ingr
	n = 0
	suma = 0
	Repetir
		n = n+1
		Escribir "Ingresar valor"
		Leer x
		suma = suma+x
	Hasta Que n>=ingr
	Escribir "x==",suma
	Escribir "ingresar potencia"
	Leer p
	conta = 0
	Repetir
		expo = suma*suma
		conta = conta+1
	Hasta Que conta>=p
	Escribir expo
	// condicion mal sentenciada
	j = 0
	Repetir
		j = j+1
		mu = trunc(expo/10)
		res = mu+mu
	Hasta Que j<=0
	varia = 0
	Repetir
		total = mu
		divisor = total+varia
		varia = varia-1
	Hasta Que varia==suma
	Escribir "varia",varia,"mud",divisor
	// ver sumando cuanto vale crea variable par sumar los mod
	Si sumando==expo Entonces
		Escribir "capricho"
	SiNo
		Escribir "no es capri"
	FinSi
	Escribir "esre es residuo",res
FinAlgoritmo
