create table FacturaService_Cliente (
	clienteId LONG not null primary key,
	name VARCHAR(75) null,
	cell VARCHAR(75) null
);

create table FacturaService_Factura (
	facturaId LONG not null primary key,
	total VARCHAR(75) null,
	clienteId LONG
);

create table FacturaService_ItemFactura (
	itemFacturaId LONG not null primary key,
	cantidadProd LONG,
	facturaId LONG,
	productoId LONG
);

create table FacturaService_Producto (
	productoId LONG not null primary key,
	name VARCHAR(75) null,
	precio DOUBLE
);