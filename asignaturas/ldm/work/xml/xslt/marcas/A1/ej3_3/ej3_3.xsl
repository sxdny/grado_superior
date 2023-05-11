<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:strip-space elements="*" />

  <xsl:template match="ies">
    <html>
      <xsl:apply-templates />
    </html>
  </xsl:template>

  <xsl:template match="nombre">
    <h1><xsl:value-of select="." /></h1>
  </xsl:template>

  <xsl:template match="web">
  </xsl:template>

  <xsl:template match="ciclos">
   <table border="1">
    <tr>
      <th>Nombre del ciclo</th>
      <th>Grado</th>
      <th>Año del título</th>
    </tr>
     <xsl:apply-templates />
    </table>
  </xsl:template>

  <xsl:template match="ciclo">
    <tr>
      <td><xsl:value-of select="nombre"/></td>
      <td><xsl:value-of select="grado"/></td>
      <td><xsl:value-of select="decretoTitulo/@año"/></td>
    </tr>
  </xsl:template>
</xsl:stylesheet>