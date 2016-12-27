<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" />
	<xsl:template match="/">
		<html>
			<head>
				<link rel="stylesheet" type="text/css" href="Style.css" />
			</head>
			<body>
				<h2 class="header">
					<center>Clients of CBRT</center>
				</h2>
				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>Company</th>
								<th>Country</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//Client/Company">
								<tr>
									<td>
										<xsl:value-of select="CompanyName" />
									</td>
									<td>
										<xsl:value-of select="Country" />
									</td>

								</tr>
							</xsl:for-each>
						</tbody>
					</table>
				</div>



			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>

