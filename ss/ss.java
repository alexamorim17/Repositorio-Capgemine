package ss;

import java.util.Optional;
import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String senha;
		int contador = 0;
		boolean requisito = false, requisito2 = false, requisito3 = false, requisito4 = false, requisito5 = false;

		System.out.println("Digite uma senha: ");
		senha = ler.nextLine();

		if (senha.length() > 5) {
			requisito = true;
			contador += 1;
		}
		if (senha.length() >= 1) {
			requisito2 = true;
			contador += 1;
		}
		for (int x = 0; x < senha.length(); x++) {

			if (senha.charAt(x) == '@' || senha.charAt(x) == '!' || senha.charAt(x) == '#' || senha.charAt(x) == '$'
					|| senha.charAt(x) == '%' || senha.charAt(x) == '^' || senha.charAt(x) == '&'
					|| senha.charAt(x) == '*' || senha.charAt(x) == '(' || senha.charAt(x) == ')'
					|| senha.charAt(x) == '-' || senha.charAt(x) == '+' && requisito2 == false) {

				requisito3 = true;
				contador += 1;
			}

			if (senha.charAt(x) >= 'A' && senha.charAt(x) <= 'Z' && requisito3 == false) {
				contador += 1;
				requisito4 = true;
			}

			if (senha.charAt(x) >= 'a' && senha.charAt(x) <= 'z' && requisito4 == false) {
				contador += 1;
				requisito5 = true;
			}

		}
		
		if(requisito != true && (requisito3  == false || requisito4 == false || requisito5 == false)) {
		System.out.print(senha.length() + " - Você pode tornar a senha mais segura adicionando "+ (6 - senha.length())+" caracteres" +", por exemplo,"+senha + "eA$, " +((int)6 - senha.length() -1)+ " caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.");
		}else if(contador == 6) {
			System.out.println(senha.length() +"- Senha forte , cumpre com os requisitos");
		}else if(requisito == true && requisito3  == false || requisito4 == false || requisito5 == false) {
			System.out.println(senha.length() + "- Sua senha cumpre com os requisitos de tamanho, porém não com outros requisitos, tente adicionar caracteres especiais, letra maiúscula e minúscula caso não tenha.");
		}

	}

}
