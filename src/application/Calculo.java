package application;

public class Calculo {
	
	private char sexo;
	private Integer flexao;
	private Integer abdominais;
	private Integer corrida;
	
	public Calculo() {
	}
	
	public Calculo(char sexo, Integer flexao, Integer abdominais, Integer corrida) {
		this.sexo = sexo;
		this.flexao = flexao;
		this.abdominais = abdominais;
		this.corrida = corrida;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getFlexao() {
		return flexao;
	}

	public void setFlexao(Integer flexao) {
		this.flexao = flexao;
	}

	public Integer getAbdominais() {
		return abdominais;
	}

	public void setAbdominais(Integer abdominais) {
		this.abdominais = abdominais;
	}

	public Integer getCorrida() {
		return corrida;
	}

	public void setCorrida(Integer corrida) {
		this.corrida = corrida;
	}
	
	public String ResultadoFlexao(Integer flexao) {
		String resultadoFlexao = null;

		if (sexo == 'M' || sexo == 'm') {
			if (flexao <= 19) {
				resultadoFlexao = "NÃO APTO";
			} 
			else if (flexao >= 20 && flexao <= 24) {
				resultadoFlexao = "ZONA DE TOLERANCIA";
			}
			else if (flexao >= 25 && flexao <= 30) {
				resultadoFlexao = "SUFICIENTE";
			}
			else if (flexao >= 31 && flexao <= 41) {
				resultadoFlexao = "BOM";
			}
			else if (flexao >= 42 && flexao <= 52) {
				resultadoFlexao = "MUITO BOM";
			}
			else if (flexao >= 53) {
				resultadoFlexao = "EXCELENTE";
			}
		} 
		else if (sexo == 'F' || sexo == 'f') {
			if (flexao <= 14) {
				resultadoFlexao = "NÃO APTO";
			} 
			else if (flexao >= 15 && flexao <= 16) {
				resultadoFlexao = "ZONA DE TOLERANCIA";
			}
			else if (flexao >= 17 && flexao <= 25) {
				resultadoFlexao = "SUFICIENTE";
			}
			else if (flexao >= 26 && flexao <= 34) {
				resultadoFlexao = "BOM";
			}
			else if (flexao >= 35 && flexao <= 40) {
				resultadoFlexao = "MUITO BOM";
			}
			else if (flexao >= 41) {
				resultadoFlexao = "EXCELENTE";
			}
		}
		else {
			System.out.println("Erro na identificação do sexo.");
		}
		return resultadoFlexao;
	}
	
	public String ResultadoAbs(Integer abdominais) {
		String resultadoAbs = null;

		if (sexo == 'M' || sexo == 'm') {
			if (abdominais <= 32) {
				resultadoAbs = "NÃO APTO";
			} 
			else if (abdominais >= 33 && abdominais <= 36) {
				resultadoAbs = "ZONA DE TOLERANCIA";
			}
			else if (abdominais >= 37 && abdominais <= 44) {
				resultadoAbs = "SUFICIENTE";
			}
			else if (abdominais >= 45 && abdominais <= 54) {
				resultadoAbs = "BOM";
			}
			else if (abdominais >= 55 && abdominais <= 61) {
				resultadoAbs = "MUITO BOM";
			}
			else if (abdominais >= 62) {
				resultadoAbs = "EXCELENTE";
			}
		} 
		else if (sexo == 'F' || sexo == 'f') {
			if (abdominais <= 27) {
				resultadoAbs = "NÃO APTO";
			} 
			else if (abdominais >= 28 && abdominais <= 29) {
				resultadoAbs = "ZONA DE TOLERANCIA";
			}
			else if (abdominais >= 30 && abdominais <= 39) {
				resultadoAbs = "SUFICIENTE";
			}
			else if (abdominais >= 40 && abdominais <= 49) {
				resultadoAbs = "BOM";
			}
			else if (abdominais >= 50 && abdominais <= 57) {
				resultadoAbs = "MUITO BOM";
			}
			else if (abdominais >= 58) {
				resultadoAbs = "EXCELENTE";
			}
			}
		else {
			System.out.println("Erro na identificação do sexo.");
		}
		return resultadoAbs;
	}
	
	public String ResultadoCorrida(Integer corrida) {
		String resultadoCorrida = null;

		if (sexo == 'M' || sexo == 'm') {
			if (corrida <= 2049) {
				resultadoCorrida = "NÃO APTO";
			} 
			else if (corrida >= 2050 && corrida <= 2129) {
				resultadoCorrida = "ZONA DE TOLERANCIA";
			}
			else if (corrida >= 2130 && corrida <= 2409) {
				resultadoCorrida = "SUFICIENTE";
			}
			else if (corrida >= 2410 && corrida <= 2699) {
				resultadoCorrida = "BOM";
			}
			else if (corrida >= 2700 && corrida <= 2959) {
				resultadoCorrida = "MUITO BOM";
			}
			else if (corrida >= 2960) {
				resultadoCorrida = "EXCELENTE";
			}
		} 
		else if (sexo == 'F' || sexo == 'f') {
			if (corrida <= 1699) {
				resultadoCorrida = "NÃO APTO";
			} 
			else if (corrida >= 1700 && corrida <= 1759) {
				resultadoCorrida = "ZONA DE TOLERANCIA";
			}
			else if (corrida >= 1760 && corrida <= 1949) {
				resultadoCorrida = "SUFICIENTE";
			}
			else if (corrida >= 1950 && corrida <= 2199) {
				resultadoCorrida = "BOM";
			}
			else if (corrida >= 2200 && corrida <= 2489) {
				resultadoCorrida = "MUITO BOM";
			}
			else if (corrida >= 2490) {
				resultadoCorrida = "EXCELENTE";
			}
		}
		else {
			System.out.println("Erro na identificação do sexo.");
		}
		return resultadoCorrida;
	}
	
	public String ResultadoFinal(String resultadoFlexao, String resultadoAbs, String resultadoCorrida) {
		String resultadoFinal = null;
		
		if (resultadoFlexao == "NÃO APTO" || resultadoAbs == "NÃO APTO" || resultadoCorrida == "NÃO APTO") {
			resultadoFinal = "NÃO APTO";
		}
		else {
			resultadoFinal = "APTO";
		}
		
		return resultadoFinal;
	}	
}