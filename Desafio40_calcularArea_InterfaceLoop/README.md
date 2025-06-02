# Desafio: Calcular Área com Interface e Loop

## 🔍 Objetivo

Criar um programa que:

* Define uma interface `Forma` com o método `calcularArea()`
* Implemente essa interface nas classes `Circulo` e `Quadrado`
* Crie uma lista de formas (objetos do tipo `Forma`)
* Utilize um loop para calcular e exibir a área de cada forma

## 📁 Estrutura de Pacotes

```
br.com.pet.Calculos
│
├── app
│   └── Principal.java         // Classe principal do programa
│
├── interfaces
│   └── Forma.java            // Interface com o método calcularArea()
│
└── models
    ├── Circulo.java          // Implementação da interface para círculo
    └── Quadrado.java         // Implementação da interface para quadrado
```

## ⚖️ Lógica

* A interface `Forma` define o contrato `double calcularArea();`
* Cada classe implementa esse contrato com sua própria fórmula:

    * `Circulo`: π \* raio \* raio
    * `Quadrado`: lado \* lado
* Os objetos são armazenados em uma lista do tipo `List<Forma>`
* Um `for-each` percorre a lista e imprime a área de cada forma

## ✏️ Exemplo de Saída

```bash
Forma: Circulo - Raio: 5.0 - Área: 78.54
Forma: Quadrado - Lado: 4.0 - Área: 16.00
```

## 📝 Possíveis Melhorias

* Adicionar método `toString()` personalizado em cada forma
* Validar se valores como raio ou lado são positivos
* Utilizar BigDecimal para mais precisão em cálculos
* Aplicar padrão de projeto `Factory` para instanciar formas

## ✨ Aprendizados

* Uso de **interfaces** e **polimorfismo**
* Prática com **listas genéricas** (`List<Forma>`)
* Aplicar **laços de repetição** para operações com coleções

---

📊 Desenvolvido como parte de estudos sobre POO em Java.

Este projeto tem como objetivo praticar o uso de interfaces em Java.

As classes Circulo e Quadrado implementam a interface Forma, com o método calcularArea().

O loop principal percorre uma lista de Formas e imprime a área de cada uma.
