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

