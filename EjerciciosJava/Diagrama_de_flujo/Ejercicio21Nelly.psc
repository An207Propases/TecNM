Algoritmo sin_titulo
	Escribir "valores"
	Leer a,P,n,cont
	Si residuo==1 & esp>=10 <>nomr Entonces
		Para variable<-Capri=0 Hasta Capri=Capri+b Con Paso Capri==a Hacer
			cociente = cociente
			Para variable<-i=a Hasta i++ Con Paso iP Hacer
				Si Capri*(i)==1 & Capri*(n)==1 Entonces
					cont = cont+1
					Escribir i
				FinSi
				esp = esp+1
			FinPara
			residuo = 0
			num = nomr
			Repetir
				cociente = num/10
				residuo = num/10
			Hasta Que cociente>0
		FinPara
	FinSi
	Escribir "total",cont
FinAlgoritmo
