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
					<center>Contractual Employees of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>AssignmentDate</th>
								<th>ContractExpDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//Employee/Contractual">
								<tr>
									<td>
										<xsl:value-of select="Title" />
									</td>
									<td>
										<xsl:value-of select="FirstName" />
									</td>
									<td>
										<xsl:value-of select="LastName" />
									</td>
									<td>
										<xsl:value-of select="AssignmentDate" />
									</td>
									<td>
										<xsl:value-of select="ContractExpDate" />
									</td>
								</tr>
							</xsl:for-each>
						</tbody>
					</table>
				</div>

				<h2 class="header">
					<center>Regular Employees of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>AssignmentDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//Employee/Regular">
								<tr>
									<td>
										<xsl:value-of select="Title" />
									</td>
									<td>
										<xsl:value-of select="FirstName" />
									</td>
									<td>
										<xsl:value-of select="LastName" />
									</td>
									<td>
										<xsl:value-of select="AssignmentDate" />
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

