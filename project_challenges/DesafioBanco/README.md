# Banco Digital em Java e Orientação a Objetos

Este projeto é uma realização do desafio proposto pelo professor [Venilton](https://github.com/falvojr/), que simula a abstração de um banco digital utilizando os conceitos de Orientação a Objetos com Java.

O cenário proposto: “Um banco que disponibiliza aos seus clientes dois tipos de contas - corrente e poupança. Ambas contas oferecem funcionalidades de depósito, saque e transferência entre contas da mesma instituição”.

## 🚀 Recursos Adicionais

Além do código base apresentado pelo professor:

- Organização do projeto em pacotes específicos.
- Métodos para listar clientes e contas.
- Documentação extensiva nas classes para fácil entendimento.
- Refatoração de métodos para melhor adaptação ao projeto.

## 📁 Estrutura de Diretórios

```
.
├── .vscode
├── bin
├── lib
├── src
│   └── com
│       └── finansys
│           ├── dao
│           │   └── Banco.java
│           ├── exceptions
│           │   ├── ClienteNotFoundException.java
│           │   └── ContaNotFoundException.java
│           ├── model
│           │   ├── Cliente.java
│           │   ├── Conta.java
│           │   ├── ContaCorrente.java
│           │   └── ContaPoupanca.java
│           └── utils
│               └── InterfaceConta.java
└── Main.java
```
