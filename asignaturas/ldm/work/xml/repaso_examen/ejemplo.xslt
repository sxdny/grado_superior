<?xml version="1.0" encoding="UTF-8"?>
<!-- Declaración del documento XML. -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!-- Espacio de nombres. -->

	<xsl:template match="/">
	<!-- Se aplica a todo el documento. -->
		<html lang="en">
			<head>
				<meta charset="UTF-8" />
			</head>
			<body>
			<xsl:for-each select="peliculas/pelicula">
			<xsl:if test="argumento = Maravillosa Jugada ">
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
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>