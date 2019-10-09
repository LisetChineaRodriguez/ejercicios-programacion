/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Liset Chinea
 */
public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
   String pro = "\033[38;5;226mpro\033[0;m\t";
   String bbdd = "\033[38;5;196mbbdd\033[0;m\t";
   String edd = "\033[35;5;95medd\033[0;m\t";
   String lm = "\033[35;5;45mlm\033[0;m\t";
   String sinf = "\033[35;5;57msinf\033[0;m\t";
   String fol = "\033[35;5;82mfol\033[0;m\t";
   System.out.println(pro + edd + pro + pro + sinf);
   System.out.println(pro + lm + pro + pro + sinf);
   System.out.println(pro + lm + pro + edd + sinf);
   System.out.println(bbdd + sinf + bbdd + edd + fol);
   System.out.println(bbdd + sinf + bbdd + lm + fol);
   System.out.println(bbdd + sinf + bbdd + lm + fol);
  }
}
