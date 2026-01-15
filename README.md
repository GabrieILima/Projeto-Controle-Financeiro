# Financial Control System (Java)

## 📌 Overview

This project aims to develop a personal financial control system,
allowing the registration of income, expenses, and investments, with support
for recurring transactions (monthly, annual, semiannual, and one-time).

The project is being developed with a focus on good domain modeling practices
and a progressive approach to learning system development using Java.

## 🎯 Project Objectives

The main objectives of this project are:

- To develop a functional personal financial control system
- To practice domain modeling (Domain-Driven Design)
- To learn Java in a structured and conscious way
- To separate business rules, application, and infrastructure
- To progressively evolve the system (CLI → App → other interfaces)

## 🧱 Architecture and Structure

### Domain Layer

The domain layer contains the core business rules of the system and is independent
of user interfaces, databases, or frameworks.

Main components:

- Movimentacao: represents a financial obligation with value, type, due date, and recurrence
- Conta: aggregate responsible for calculating the balance from transactions
- TipoMovimentacao: defines whether a transaction is an income or an expense
- TipoRecorrencia: defines how a transaction occurs over time

## 🔁 Development Flow

The system development follows the order below:

1. Domain modeling and completion
2. Creation of a CLI application for user interaction
3. Evolution of the application layer
4. Implementation of data persistence
5. Possible evolution to a graphical or web interface

## 🚧 Project Status

Current project status:

- [x] Domain modeling and implementation
- [ ] CLI application
- [ ] Data persistence
- [ ] Graphical or web interface


----------------------------------------------------Em português--------------------------------------------------------



# Financial Control System (Java)

## 📌 Visão Geral

  Este projeto tem como objetivo o desenvolvimento de um sistema de controle financeiro pessoal,
permitindo o registro de ganhos, perdas e investimentos, com suporte a movimentações recorrentes
(mensais, anuais, semestrais e eventuais).

  O projeto está sendo desenvolvido com foco em boas práticas de modelagem de domínio e aprendizado
progressivo de desenvolvimento de sistemas em Java.

## 🎯 Objetivos do Projeto

Os principais objetivos deste projeto são:

- Desenvolver um sistema funcional de controle financeiro
- Praticar modelagem de domínio (Domain-Driven Design)
- Aprender Java de forma estruturada e consciente
- Separar regras de negócio, aplicação e infraestrutura
- Evoluir o sistema gradualmente (CLI → App → outras interfaces)

## 🧱 Arquitetura e Estrutura

### Camada Domain

A camada de domínio contém as regras de negócio centrais do sistema e é independente
de interface, banco de dados ou frameworks.

Principais componentes:

- Movimentacao: representa uma obrigação financeira com valor, tipo, vencimento e recorrência
- Conta: agregadora responsável por calcular o saldo a partir das movimentações
- TipoMovimentacao: define se uma movimentação é entrada ou saída
- TipoRecorrencia: define como a movimentação ocorre ao longo do tempo

## 🔁 Fluxo de Desenvolvimento

O desenvolvimento do sistema segue a seguinte ordem:

1. Modelagem e finalização do Domain
2. Criação de uma aplicação CLI para interação com o usuário
3. Evolução da camada de aplicação
4. Implementação de persistência de dados
5. Possível evolução para interface gráfica ou web

## 🚧 Status do Projeto

Status atual do projeto:

- [x] Modelagem e implementação do Domain
- [ ] Aplicação CLI
- [ ] Persistência de dados
- [ ] Interface gráfica ou web

