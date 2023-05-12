<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:strip-space elements="*" />

<xsl:template match="/">
  <lugares>
    <xsl:apply-templates />
  </lugares>
</xsl:template>

<xsl:template match="museo">
  <lugar tipo="museo">
    <ubicacion nombre="ciudad"><xsl:value-of select="@ciudad" /></ubicacion>
    <ubicacion nombre="pais"><xsl:value-of select="@pais" /></ubicacion>
    <nombre><xsl:value-of select="@nombre" /></nombre>
  </lugar>
</xsl:template>

</xsl:stylesheet>