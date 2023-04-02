## Exercici 10

Escriure un algorisme que calculi i escrigui la suma i el producte dels nombres parells compresos entre dos límits que s’han de llegir per teclat (utilitzant les tres estructures iteratives).

#### Con **FOR**

**algorisme** SumaYProducte
&emsp;**var** 
&emsp;&emsp;minim, maxim, resultado_suma, i, resultado_multiplicacion: enter
&emsp;**fi_var**
&emsp;escriure "Introdueix el nombre MINIM:"
&emsp;llegir (minim)
&emsp;escriure "Introdueix el nombre MAXIM:"
&emsp;llegir (maxim)
&emsp;resultado_multiplicacion <-- 1
&emsp;resultado_suma <-- 0
&emsp;&emsp;**per** i e (minim...maxim) **pas** 1
&emsp;&emsp;&emsp;**si** i % 2 = 0
&emsp;&emsp;&emsp;&emsp;resultado_suma <-- resultado_suma + i
&emsp;&emsp;&emsp;&emsp;resultado_multiplicacion <-- resultado_multiplicacion * i
&emsp;&emsp;&emsp;**fisi**
&emsp;&emsp;**fiper**
**fialgorisme**

---

#### Con REPETIR

**algorisme** SumaYProducte
&emsp;**var** 
&emsp;&emsp;minim, maxim, resultado_suma, i, resultado_multiplicacion: enter
&emsp;**fi_var**
&emsp;escriure "Introdueix el nombre MINIM:"
&emsp;llegir (minim)
&emsp;escriure "Introdueix el nombre MAXIM:"
&emsp;llegir (maxim)
&emsp;resultado_multiplicacion <-- 1
&emsp;resultado_suma <-- 0
&emsp;&emsp;**repetir**
&emsp;&emsp;i <-- i + 1
&emsp;&emsp;&emsp;**si** i % 2 = 0
&emsp;&emsp;&emsp;&emsp;resultado_suma <-- resultado_suma + i
&emsp;&emsp;&emsp;&emsp;resultado_multiplicacion <-- resultado_multiplicacion * i
&emsp;&emsp;&emsp;**fisi**
&emsp;&emsp;**fins que i = maxim**
**fialgorisme**

---

#### Con MENTRE

**algorisme** SumaYProducte
&emsp;**var** 
&emsp;&emsp;minim, maxim, resultado_suma, i, resultado_multiplicacion: enter
&emsp;**fi_var**
&emsp;escriure "Introdueix el nombre MINIM:"
&emsp;llegir (minim)
&emsp;escriure "Introdueix el nombre MAXIM:"
&emsp;llegir (maxim)
&emsp;resultado_multiplicacion <-- 1
&emsp;resultado_suma <-- 0
&emsp;&emsp;**mentre** i != maxim
&emsp;&emsp;&emsp;**si** i % 2 = 0
&emsp;&emsp;&emsp;&emsp;resultado_suma <-- resultado_suma + i
&emsp;&emsp;&emsp;&emsp;resultado_multiplicacion <-- resultado_multiplicacion * i
&emsp;&emsp;&emsp;**fisi**
&emsp;&emsp;**fimentre**
**fialgorisme**



