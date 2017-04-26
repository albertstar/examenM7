package activitat;

/**
 * 
 * @author cfgs
 * @version 1.0
 */

public class Fibonacci {

	/**
	 * 
	 * @param n Requereix un double
	 * @return Retorna el resultat de la funcio 
	 * @throws IllegalArgumentException Retornara una exepcio al introduir un parametre ilegal
	 */
    public double getRecursiveFibonacci(double n) throws IllegalArgumentException {
        if (n < 0){
            throw new IllegalArgumentException();
        }

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        Fibonacci fiborecursive = new Fibonacci();
        return fiborecursive.getRecursiveFibonacci(n - 1) + fiborecursive.getRecursiveFibonacci(n - 2);
    }
}
