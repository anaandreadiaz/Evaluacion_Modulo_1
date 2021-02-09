package modulo.evaluacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	private static Integer validarInt(String cadenaIngr) {
		Integer validarInt;
		try {
			validarInt = Integer.parseInt(cadenaIngr);
		} catch (Exception e) {
			validarInt = 0;
		}
		return validarInt;
	}

	private static Cliente agregarCliente() {
		Scanner in = new Scanner(System.in);
		String nombre, fechNac, nombres, apellidos, telefono, afp, direccion, comuna;
		Integer run, rut, salud, edad;
		Boolean validarFecha;

		do {
			System.out.println("Ingrese el nombre del usuario");
			nombre = in.nextLine();
		} while (nombre.length() < 10 || nombre.length() > 50 || nombre.trim().length() == 0);
		do {
			System.out.println("Ingrese la fecha de nacimiento del usuario");
			fechNac = in.nextLine();
			try {
				Integer diaNac = Integer.parseInt(fechNac.substring(0, 2));
				Integer mesNac = Integer.parseInt(fechNac.substring(3, 5));
				Integer a�oNac = Integer.parseInt(fechNac.substring(6, 10));
				LocalDate.of(a�oNac, mesNac, diaNac);
				validarFecha = true;
			} catch (Exception e) {
				validarFecha = false;
			}
		} while (validarFecha == false);

		do {
			System.out.println("Ingrese el RUN del usuario \n(Sin puntos ni digito verificador)");
			run = validarInt(in.nextLine());

		} while (run > 99999999);
		do {
			System.out.println("Ingrese el RUT del cliente \n(Sin puntos ni digito verificador)");
			rut = validarInt(in.nextLine());
		} while (rut > 99999999);
		do {
			System.out.println("Ingrese los nombres del cliente");
			nombres = in.nextLine();
		} while (nombres.length() < 5 || nombres.length() > 30 || nombres.trim().length() == 0);
		do {
			System.out.println("Ingrese los apellidos del cliente");
			apellidos = in.nextLine();
		} while (apellidos.length() < 5 || apellidos.length() > 30 || apellidos.trim().length() == 0);
		do {
			System.out.println("Ingrese el telefono del cliente");
			telefono = in.nextLine();
		} while (telefono.trim().length() == 0);
		do {
			System.out.println("Ingrese la afp del cliente");
			afp = in.nextLine();
		} while (afp.length() < 4 || afp.length() > 30);
		do {
			System.out.println("Ingrese el sistema de salud del cliente (\n1. Fonasa. \n2. Isapre.)");
			salud = validarInt(in.nextLine());
		} while (salud != 0 && salud != 1 && salud != 2);
		do {
			System.out.println("Ingrese la direccion del cliente");
			direccion = in.nextLine();
		} while (direccion.length() > 70);
		do {
			System.out.println("Ingrese la comuna del cliente");
			comuna = in.nextLine();
		} while (comuna.length() > 50);
		do {
			System.out.println("Ingrese la edad del cliente");
			edad = validarInt(in.nextLine());
		} while (edad <= 0 || edad > 150);

		Cliente nuevoCliente = new Cliente(nombre, fechNac, run, rut, nombres, apellidos, telefono, afp, salud,
				direccion, comuna, edad);
		return nuevoCliente;
	}

	private static Profesional agregarProfesional() {
		Scanner in = new Scanner(System.in);
		String nombre, fechNac, titulo, fechIngre;
		Integer run;
		Boolean validarFecha;

		do {
			System.out.println("Ingrese el nombre del usuario");
			nombre = in.nextLine();
		} while (nombre.length() < 10 || nombre.length() > 50 || nombre.trim().length() == 0);
		do {
			System.out.println("Ingrese la fecha de nacimiento del usuario");
			fechNac = in.nextLine();
			try {
				Integer diaNac = Integer.parseInt(fechNac.substring(0, 2));
				Integer mesNac = Integer.parseInt(fechNac.substring(3, 5));
				Integer a�oNac = Integer.parseInt(fechNac.substring(6, 10));
				LocalDate.of(a�oNac, mesNac, diaNac);
				validarFecha = true;
			} catch (Exception e) {
				validarFecha = false;
			}
		} while (validarFecha == false);
		do {
			System.out.println("Ingrese el RUN del usuario \n(Sin puntos ni digito verificador)");
			run = validarInt(in.nextLine());
		} while (run > 99999999);
		do {
			System.out.println("Ingrese el t�tulo del profesional");
			titulo = in.nextLine();
		} while (titulo.length() < 10 || titulo.length() > 50 || titulo.trim().length() == 0);
		do {
			System.out.println("Ingrese la fecha de ingreso del profesional");
			fechIngre = in.nextLine();
			if (fechIngre.trim().length() != 0) {
				try {
					Integer diaNac = Integer.parseInt(fechIngre.substring(0, 2));
					Integer mesNac = Integer.parseInt(fechIngre.substring(3, 5));
					Integer a�oNac = Integer.parseInt(fechIngre.substring(6, 10));
					LocalDate.of(a�oNac, mesNac, diaNac);
					validarFecha = true;
				} catch (Exception e) {
					validarFecha = false;
				}
			}

		} while (validarFecha == false && fechIngre.trim().length() != 0);

		Profesional nuevoPro = new Profesional(nombre, fechNac, run, titulo, fechIngre);
		return nuevoPro;

	}

	private static Administrativo agregarAdministrativo() {
		Scanner in = new Scanner(System.in);
		String nombre, fechNac, area, experiencia;
		Integer run;
		Boolean validarFecha;

		do {
			System.out.println("Ingrese el nombre del usuario");
			nombre = in.nextLine();
		} while (nombre.length() < 10 || nombre.length() > 50 || nombre.trim().length() == 0);
		do {
			System.out.println("Ingrese la fecha de nacimiento del usuario");
			fechNac = in.nextLine();
			try {
				Integer diaNac = Integer.parseInt(fechNac.substring(0, 2));
				Integer mesNac = Integer.parseInt(fechNac.substring(3, 5));
				Integer a�oNac = Integer.parseInt(fechNac.substring(6, 10));
				LocalDate.of(a�oNac, mesNac, diaNac);
				validarFecha = true;
			} catch (Exception e) {
				validarFecha = false;
			}
		} while (validarFecha == false);
		do {
			System.out.println("Ingrese el RUN del usuario \n(Sin puntos ni digito verificador)");
			run = validarInt(in.nextLine());
		} while (run > 99999999);
		do {
			System.out.println("Ingrese el �rea del administrativo");
			area = in.nextLine();
		} while (area.length() < 10 || area.length() > 50 || area.trim().length() == 0);
		do {
			System.out.println("Ingrese la experiencia previa del administrativo");
			experiencia = in.nextLine();
		} while (experiencia.length() > 100);

		Administrativo nuevoAdmin = new Administrativo(nombre, fechNac, run, area, experiencia);
		return nuevoAdmin;

	}

	public static Capacitacion agregarCapacitacion() {
		Scanner in = new Scanner(System.in);
		String dia, lugar, hora, duracion, semana = "lunesmartesmi�rcolesmiercolesjuevesvierness�badosabadodomingo";
		Integer identificador, rutCliente, asistentes;
		Boolean validador = true;

		do {
			System.out.println("Ingrese el identificador de la capacitaci�n");
			identificador = validarInt(in.nextLine());
		} while (identificador == 0);
		do {
			System.out.println("Ingrese el rut del cliente");
			rutCliente = validarInt(in.nextLine());
		} while (rutCliente > 99999999 || rutCliente == 0);
		do {
			System.out.println("Ingrese el d�a de la capacitaci�n");
			dia = in.nextLine();
		} while (!semana.contains(dia.toLowerCase()) && dia.trim().length() != 0);
		do {
			System.out.println("Ingrese la hora de la capacitaci�n \n(HH:MM)");
			hora = in.nextLine();
			if (hora.trim().length() != 0) {
				try {
					LocalTime horaCap = LocalTime.parse(hora, DateTimeFormatter.ofPattern("HH:mm"));
					validador = true;
				} catch (Exception e) {
					validador = false;
					System.out.println("Formato de hora err�neo");
				}
			}

		} while (validador == false);
		do {
			System.out.println("Ingrese el lugar de la capacitaci�n");
			lugar = in.nextLine();
		} while (lugar.trim().length() < 10 || lugar.trim().length() > 50 || lugar.trim().length() == 0);
		do {
			System.out.println("Ingrese la duraci�n de la capacitaci�n");
			duracion = in.nextLine();		
		} while (duracion.trim().length() > 70 && duracion.trim().length() != 0);
		do {
			System.out.println("Ingrese la cantidad de asistentes de la capacitaci�n");
			asistentes = validarInt(in.nextLine());
		} while (asistentes >= 1000 || asistentes == 0);

		Capacitacion nuevaCap = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion, asistentes);
		return nuevaCap;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String run, tipoUsu;
		Integer opcion;
		Contenedor listaAses = new Contenedor();
		Contenedor listaCap = new Contenedor();
		listaAses.setListaAses(new ArrayList<Asesoria>());
		listaCap.setListaCap(new ArrayList<Capacitacion>());

		do {
			System.out.println("Men� principal \n1. Almacenar cliente. "
					+ "\n2. Almacenar profesional. \n3. Almacenar administrativo. "
					+ "\n4. Almacenar capacitaci�n. \n5. Eliminar usuario. \n6. Listar Usuarios. "
					+ "\n7. Listar usuarios por tipo.\n8. Listar capacitaciones. \n9. Salir.");
			opcion = entrada.nextInt();
			entrada.nextLine();

			switch (opcion) {
			case 1:
				listaAses.almacenarCliente(agregarCliente());
				break;

			case 2:
				listaAses.almacenarProfesional(agregarProfesional());
				break;

			case 3:
				listaAses.almacenarAdministrativo(agregarAdministrativo());
				break;

			case 4:
				listaCap.almacenarCapacitacion(agregarCapacitacion());
				break;

			case 5:
				System.out.println("Ingrese el RUN del usuario que desea eliminar");
				run = entrada.nextLine();
				listaAses.eliminarUsuario(run);
				break;

			case 6:
				listaAses.listarUsuarios();
				break;

			case 7:
				do {
					System.out.println("Ingrese el tipo de usuario que desea desplegar");
					tipoUsu = entrada.nextLine();
				} while (!tipoUsu.toLowerCase().equals("cliente") && !tipoUsu.toLowerCase().equals("profesional")
						&& !tipoUsu.toLowerCase().equals("administrativo"));
				listaAses.listarUsuarioTipo(tipoUsu);
				break;

			case 8:
				listaCap.listarCapacitaciones();
				break;

			default:
				if (opcion != 9) {
					System.out.println("Error, ingrese una opci�n v�lida");
				}
				break;
			}
		} while (opcion != 9);
		System.out.println("Ejecuci�n finalizada");
		entrada.close();

	}

}
