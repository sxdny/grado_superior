tags:: #repaso_examen #lenguaje_de_marcas #xslt

# Repaso examen Lenguaje de Marcas.

## Estructura básica de un archivo xslt.

Los elementos principales de un archivo `.xslt` son:

- Declaración de un documento XML.

````xml
<?xml version="1.0" encoding="UTF-8"?>
````

- Un elemento raíz.

````xml
<xsl:styleshhet xmlns:xsl="https://www.w3.org/1999/XSL/Transform" version="1.0">
````

Elemento *template match*, con elemento de apertura y de cierre.

````xml
<xsl:template march="/">
	<!-- Elementos HTML con los [values of del XSLT] -->
</xsl:template>
````

## Definición de los diferentes elementos.

- **Value of.** Obtiene el valor de un elemento o atributo.

````xml
<xsl:value-of select="pelicula/titulo"/>
<!-- Obtiene el valor del elemento <titulo> del XML -->
````

- **For each.** Recorre un conjunto de elementos. Es como un `for i` de programación normal de toda la vida.

````xml
<xsl:for-each select="peliculas/pelicula">
<!-- Recorre el elemento peliculas y selecciona el elemento <pelicula> -->
	<h2>
		<xsl:value-of select="titulo"/>
		<!-- Por cada titulo que exista, crea un <h2> -->
	</h2>
	<p>
		<xsl:value-of select="argumento"/>
		<!-- por cada argumento que exista, crea un <p> -->
	</p>
</xsl:for-each>
````

- **Sort select.** Ordena un conjunto de elementos dentro de un for each.

````xml
<xsl:for-each select="peliculas/pelicula">
<!-- Recorre el elemento peliculas y selecciona el elemento <pelicula> -->
<xsl:sort select="argumento"/>
<!-- Ordena el output del for each por <argumento> (Orden alfabético) -->
	<h2>
		<xsl:value-of select="titulo"/>
		<!-- Por cada titulo que exista, crea un <h2> -->
	</h2>
	<p>
		<xsl:value-of select="argumento"/>
		<!-- por cada argumento que exista, crea un <p> -->
	</p>
</xsl:for-each>
````

- **If test.** Permite condicionar la transformación en función a una condición. Si cumple la condición que nosotros le ponemos, mostrará lo que esté dentro del elemento if. **Solo funciona con números.**

````xml
<xsl:for-each select="peliculas/pelicula">
	<xsl:if test="argumento = 3 ">
		<h2>
			<xsl:value-of select="titulo"/>
			<!-- Por cada titulo que exista, crea un <h2> -->
		</h2>
		<p>
			<xsl:value-of select="argumento"/>
			<!-- por cada argumento que exista, crea un <p> -->
		</p>
	</xsl:if>
</xsl:for-each>
````

- **XSL Choose.** Utiliza `when` y `otherwise` para condicionar múltiples opciones. Es como un `if else`.

````xml
<xsl:choose>
	<xsl:when test="price > 10">
	<!-- Cuando el precio sea mayor 10... -->
		<td bgcolor="#ff00ff">
			<xsl:value-of select="artist"/>
		</td>
	</xsl:when>
	<!-- Si no cumple la condicion, entonces -->
	<xsl:otherwise>
		<td><xsl:value-of select="artist"/></td>
	</xsl:otherwise>
</xsl:choose>
````

- **XSL Comment**. Permite poner un comentario. Es útil porque los XML no permiten comentarios.

````xml
<xsl:comment>Comentario que no será procesado.</xsl:comment>
````

## Ejemplo archivo XSD.

### XML Schema.

````xml
<?xml version="1.0"?>  
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">  
  
<xs:element name="note">  
  <xs:complexType>  
    <xs:sequence>  
      <xs:element name="to" type="xs:string"/>  
      <xs:element name="from" type="xs:string"/>  
      <xs:element name="heading" type="xs:string"/>  
      <xs:element name="body" type="xs:string"/>  
    </xs:sequence>  
  </xs:complexType>  
</xs:element>  
  
</xs:schema>
````

### XSD.

````xml
<!ELEMENT note (to, from, heading, body)>  
<!ELEMENT to (#PCDATA)>  
<!ELEMENT from (#PCDATA)>  
<!ELEMENT heading (#PCDATA)>  
<!ELEMENT body (#PCDATA)>
````