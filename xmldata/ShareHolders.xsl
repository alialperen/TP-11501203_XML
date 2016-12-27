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
					<center>A-Type ShareHolder of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>CompanyName</th>
								<th>Country</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//ShareHolder/A_type">
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
				<h2 class="header">
					<center>B-Type ShareHolder of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>CompanyName</th>
								<th>Country</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//ShareHolder/B_type">
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
				<h2 class="header">
					<center>C-Type ShareHolder of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>CompanyName</th>
								<th>Country</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//ShareHolder/C_type">
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
				<h2 class="header">
					<center>D-Type ShareHolder of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>FirstName</th>
								<th>LastName</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//ShareHolder/D_type">
								<tr>
									<td>
										<xsl:value-of select="FirstName" />
									</td>
									<td>
										<xsl:value-of select="LastName" />
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

