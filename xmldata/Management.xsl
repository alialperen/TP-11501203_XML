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
					<center>Management of CBRT</center>
				</h2>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="6">Governor</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Graduate</th>
								<th>AssignmentDate</th>
								<th>AssignmentCount</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//Governor">
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
										<xsl:value-of select="Graduate" />
									</td>
									<td>
										<xsl:value-of select="AssignmentDate" />
									</td>
									<td>
										<xsl:value-of select="AssignmentCount" />
									</td>
								</tr>
							</xsl:for-each>
						</tbody>
					</table>
				</div>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="5">Deputy Governors</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Graduate</th>
								<th>AssignmentDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//DeputyGovernor">
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
										<xsl:value-of select="Graduate" />
									</td>
									<td>
										<xsl:value-of select="AssignmentDate" />
									</td>
								</tr>
							</xsl:for-each>
						</tbody>
					</table>
				</div>

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="3">MPC members</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>FirstName</th>
								<th>LastName</th>
								<th>AssignmentDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//MPC_member">
								<tr>
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

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="2">Board Members</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>FirstName</th>
								<th>LastName</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//BoardMember">
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

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="4">Audit Community Member</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>AssignmentDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//AuditCommunityMember">
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

				

				<div class="datagrid">
					<table>
						<thead>
							<tr>
								<th colspan="4">Executive Community Member</th>
							</tr>
						</thead>
						<thead>
							<tr>
								<th>Title</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>AssignmentDate</th>
							</tr>
						</thead>
						<tbody>
							<xsl:for-each select="//ExecCommunityMember">
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

