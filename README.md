# Projeto: Sistema Bancário com Conta Corrente e Conta Poupança

Este projeto em Java simula um sistema bancário básico com suporte a **Conta Corrente** e **Conta Poupança**, utilizando os princípios da **Programação Orientada a Objetos (POO)**: **Encapsulamento**, **Abstração**, **Herança** e **Polimorfismo**.

## Funcionalidades

O projeto permite:
- Criar clientes com seus respectivos dados (nome e CPF).
- Criar e gerenciar contas correntes e contas poupança.
- Realizar operações de saque, depósito e transferência entre contas.
- Aplicar tarifas mensais nas contas correntes.
- Aplicar rendimentos mensais nas contas poupança.
- Listar todas as contas cadastradas no sistema.

## Estrutura de Classes

### 1. Classe `Cliente`
Representa o cliente do banco com atributos como `nome` e `cpf`, e fornece métodos para acessar e modificar essas informações.

### 2. Classe Abstrata `Conta`
Esta classe define os atributos e comportamentos comuns de uma conta bancária, como o `número da conta`, `saldo`, métodos de `sacar`, `depositar` e `transferir`. É utilizada como base para as classes `ContaCorrente` e `ContaPoupanca`.

### 3. Classe `ContaCorrente`
Especializa a classe `Conta` para uma conta corrente, adicionando a funcionalidade de cobrança de uma tarifa mensal.

### 4. Classe `ContaPoupanca`
Especializa a classe `Conta` para uma conta poupança, adicionando a funcionalidade de cálculo de rendimentos com base em uma taxa de rendimento.

### 5. Classe `Banco`
Gerencia as contas e operações do banco. Permite abrir contas, realizar operações bancárias e listar todas as contas existentes.

### 6. Classe `Main`
Classe responsável por testar as funcionalidades do projeto. Cria clientes, abre contas, realiza operações como depósitos, saques, transferências e aplica tarifas e rendimentos.

## Pilares de POO Aplicados

### 1. Encapsulamento
Os atributos das classes são privados e acessados por meio de getters e setters, garantindo que os dados estejam protegidos e que seu acesso seja controlado.

### 2. Abstração
A classe abstrata `Conta` define o comportamento geral de uma conta bancária, enquanto os detalhes específicos de cada tipo de conta são implementados nas subclasses `ContaCorrente` e `ContaPoupanca`.

### 3. Herança
As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`, permitindo o reaproveitamento de código e a especialização de métodos.

### 4. Polimorfismo
Através da herança, métodos como `sacar` e `depositar` são sobrescritos nas subclasses para fornecer comportamentos diferentes dependendo do tipo de conta. Também usamos polimorfismo ao armazenar diferentes tipos de contas em uma lista de `Conta`.

## Como Executar o Projeto

1. Clone o repositório ou faça o download dos arquivos.
2. Abra o projeto em sua IDE Java preferida (ex.: IntelliJ IDEA, Eclipse).
3. Certifique-se de que o **JDK** esteja corretamente configurado.
4. Compile e execute a classe `Main` para testar as funcionalidades.

### Exemplo de Saída Esperada

```shell
Conta Corrente aberta: ContaCorrente{numero=1, saldo=0.0, cliente=Cliente{nome='João Silva', cpf='123.456.789-00'}, tarifaMensal=10.0}
Conta Poupança aberta: ContaPoupanca{numero=2, saldo=0.0, cliente=Cliente{nome='Maria Oliveira', cpf='987.654.321-00'}, taxaRendimento=0.05}

Depósito de R$ 500.0 realizado na Conta Corrente 1
Depósito de R$ 1000.0 realizado na Conta Poupança 2
Saque de R$ 100.0 realizado na Conta Corrente 1
Saque de R$ 200.0 realizado na Conta Poupança 2

Transferência realizada com sucesso!

Tarifa mensal de R$ 10.0 cobrada da Conta Corrente 1
Rendimento de R$ 40.0 aplicado na Conta Poupança 2

Listando contas do banco Banco Java:
ContaCorrente{numero=1, saldo=240.0, cliente=Cliente{nome='João Silva', cpf='123.456.789-00'}, tarifaMensal=10.0}
ContaPoupanca{numero=2, saldo=840.0, cliente=Cliente{nome='Maria Oliveira', cpf='987.654.321-00'}, taxaRendimento=0.05}
