Algoritmo sin_titulo
	Escribir 'Ingresa un valor'
	Leer va
	par = 0
	imp = 0
	Mientras va<>0 Hacer
		ci <- va MOD 10
		Segun ci  Hacer
			0:
				Escribir 'par'
				par <- par+1
			1:
				Escribir 'impar'
				imp <- imp+1
			De Otro Modo:
				Escribir 'cero'
				cero <- cero+1
		FinSegun
	FinMientras
	tot = par+imp+cero
	Escribir 'valores pares',par,'valores impares',imp,'cero',cero,"total" tot
FinAlgoritmo
