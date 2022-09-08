public class ExpresionesRegulares {
    //Escribir una expresión regular para buscar la frase exacta “Hola mundo”.
    String regex1 = "Hola Mundo";

    //Escribir una expresión regular para buscar la frase “Hola mundo” en cualquier combinación de letras mayúsculas y minúsculas.
    String regex2 = "(?i)Hola Mundo";

    //Escribir una expresión regular para buscar cualquiera de las palabras de la siguiente lista: Java, Python, Go, Pascal,Perl.
    String regex3 = "Java|Python|Go|Pascal|Perl";

    //Escribir una expresión regular para validar un correo de la Universidad de Sonora: @unison.mx o @uson.mx
    String regex4 = "^[A-Za-z0-9-_.]+(?:@unison.mx$|@uson.mx)";

    /*Escribir una expresión regular para validar que el nombre de un archivo inicie con el prefijo ISI,después 4 dígitos para representar el año, seguido de 1 digito, que puede ser 1 o 2, y que tenga como extensión.txt o .csv (e.g. ISI2022-2.csv)*/
    String regex5 = "^ISI[0-9]{4}-[12](.txt|.csv)$";
}
