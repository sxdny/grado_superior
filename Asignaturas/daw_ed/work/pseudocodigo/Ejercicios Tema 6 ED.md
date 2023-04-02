## Sidney Silva 1º DAW

### Ejercicio 3b.
---
**b) Modificar el segon algorisme perquè la comparació es faci en funció de la data de naixement de les persones (dia, mes i any) i no en funció de l’edat.**

**algorisme MésGran** 
**var** 
&emsp;nom_persona_1, nom_persona_2: cadena 
&emsp;cumpleD_persona_1, cumpleD_persona_2: enter 
&emsp;cumpleM_persona_1, cumpleM_persona_2: enter
&emsp;cumpleA_persona_1, cumpleA_persona_2: enter
**fivar**

&emsp;escriure ("Introdueix el nom de la persona 1:")
&emsp;llegir(nom_persona_1) 
&emsp;escriure ("Introdueix el nom de la persona 2:")
&emsp;llegir(nom_persona_2) 
&emsp;escriure ("Introdueix la data de naixement de ", nom_persona_1)
&emsp;llegir(cumpleD_persona_1) 
&emsp;llegir(cumpleM_persona_1)
&emsp;llegir(cumpleA_persona_1)
&emsp;escriure ("Introdueix la data de naixement de ", nom_persona_2)
&emsp;llegir(cumpleD_persona_2)
&emsp;llegir(cumpleM_persona_2)
&emsp;llegir(cumpleA_persona_2)

  **si** cumpleA_persona_1 > cumpleA_persona_2 **aleshores** 
    &emsp;escriure ("La persona més gran és: ", nom_persona2) 
  **sino** 
  **si** cumplaA_persona_2 > cumpleA_persona_1 **aleshores** 
    &emsp;escriure ("La persona més gran és: ", nom_persona1) 
  **sino** 
  &emsp;**si** cumpleA_persona_1 == cumpleA_persona_2 **aleshores**
  &emsp;&emsp; **si** cumpleM_persona_1 > cumpleM_persona_2 **aleshores**
  &emsp;&emsp;&emsp; escriure ("La persona més gran és: ", nom_persona_2)
  &emsp;&emsp; **sino**
  &emsp;&emsp; **si** cumpleM_persona_2 > cumpleM_persona_1 **aleshores**
  &emsp;&emsp;&emsp; escriure ("La persona més gran és: ", nom_persona_1)
  &emsp;&emsp; **sino**
  &emsp;&emsp;&emsp; **si** cumpleM_persona_1 == cumpleM_persona_2 **aleshores**
  &emsp;&emsp;&emsp;&emsp; **si** cumpleD_persona_1 > cumpleD_persona_2 **aleshores**
  &emsp;&emsp;&emsp;&emsp;&emsp; escriure ("La persona més gran és: ), nom_persona_2)
  &emsp;&emsp;&emsp;&emsp; **sino**
  &emsp;&emsp;&emsp;&emsp; **si** cumpleD_persona_2 > cumpleD_persona_1 **aleshores**
  &emsp;&emsp;&emsp;&emsp;&emsp; escriure ("La persona més gran és: ", nom_persona_1)
  &emsp;&emsp;&emsp;&emsp; **sino**
  &emsp;&emsp;&emsp;&emsp;&emsp; **si** cumpleD_persona_1 == cumpleD_persona_2 **aleshores**
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp; escriure ("Les dues personas tenen la mateixa edat")
  &emsp;&emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
  &emsp;&emsp;&emsp;&emsp; **fisi**
**fialgorisme** 
