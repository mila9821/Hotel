insert into restaurante(nom_plato, precio_plato, foto) values("Huevo frito", 10, "foto");
insert into restaurante(nom_plato, precio_plato, foto) values("Lomo Saltado", 15, "foto");

insert into testimonio(contenido, estado) values("buena atencion", 1);
insert into testimonio(contenido, estado) values("excelente servicio", 2);

insert into administrador(contrasena, estado, nombre, tarea, usuario) values("1234", 1, "Juan", "reservar","Juna02");
insert into administrador(contrasena, estado, nombre, tarea, usuario) values("1234", 3, "Maria", "administrar","Maria01");

insert into cliente(dni, email, foto, modo, nombre, pais, telefono) values("74052189", "cliente01@gmail.com", "foto", "activo", "Carlos", "Argentina", "985412503");
insert into cliente(dni, email, foto, modo, nombre, pais, telefono) values("45201369", "cliente02@gmail.com", "foto", "activo", "Juana", "Peruana", "995623541");

insert into detalle_reserva(adelanto, dias, ingreso, precio, salida) values(20, 2, "22/11/21", 35, "24/11/21");
insert into detalle_reserva(adelanto, dias, ingreso, precio, salida) values(30, 2, "26/11/21", 65, "28/11/21");

insert into habitacion(descripcion, estado, foto, nombre, precio, tipo) values("dos camas, ducha caliente, wifi", "ocupado", "foto", "501", 60, "Doble");
insert into habitacion(descripcion, estado, foto, nombre, precio, tipo) values("una cama, cable, wifi", "reservado", "foto", "502", 30, "Simple");