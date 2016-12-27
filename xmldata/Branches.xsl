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
					<center>Branches of CBRT</center>
				</h2>
				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>Location</th>
								<th>Name</th>
								<th>Tel</th>
								<th>Adress</th>
								<th>Employee</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//Branch">
								<tr>
									<td>
										<xsl:value-of select="branchLocation" />
									</td>
									<td>
										<xsl:value-of select="branchName" />
									</td>
									<td>
										<xsl:value-of select="telNo" />
									</td>
									<td>
										<xsl:value-of select="address" />
									</td>
									<td>
										<xsl:value-of select="employee" />
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

