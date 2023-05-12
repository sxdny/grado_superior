<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:strip-space elements="*" />

  <xsl:template match="ies">
    <html>
      <xsl:apply-templates />
    </html>
  </xsl:template>

  <xsl:template match="nombre">
      <h1>Ciclos formativos del <xsl:value-of select="." /></h1>
  </xsl:template>

  <xsl:template match="web">
  </xsl:template>

  <xsl:template match="ciclos">
    <ul>
    <xsl:apply-templates />
    </ul>
  </xsl:template>

  <xsl:template match="ciclo">
    <li><xsl:value-of select="@id" /><br />
    <xsl:value-of select="nombre" />, Ciclo Formativo de Grado <xsl:value-of select="grado" />
    creado en <xsl:value-of select="decretoTitulo/@año" /></li>
  </xsl:template>

</xsl:stylesheet>