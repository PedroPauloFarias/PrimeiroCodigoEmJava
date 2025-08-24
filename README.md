# 🚀 Meu Primeiro Código em Java

Olá! Esse é o meu primeiro código em **Java**.  
O meu começo nessa linguagem foi no dia **22/08/2025**.  
Aqui irei postar tudo dos meus primeiros passos nessa linguagem.
 desde a criação do projeto até o envio para o GitHub. 👨‍💻✨

---
# 📫 Meus Contatos

- 🔗 [LinkedIn](https://www.linkedin.com/in/seu-linkedin)
- 📷 [Instagram](https://www.instagram.com/seu-instagram)
---

# ⚙️ Configuração Inicial do Git (PRIMEIRO PASSO)

🔧 Configure seu nome e e-mail no Git:
```
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
git config --list # Verificando as configurações
```
 # 🌳 Criação do Repositório no GitHub

1. Acesse GitHub e faça login (Sign in) ou crie uma conta (Sign up)
2. Clique no ícone "+" no canto superior direito → New repository
3. Preencha os campos:
   · Repository name: digite o nome do projeto (ex.: PrimeiroCodigoEmJava)
   · Visibility: selecione Public
   · Marque Add a README file
   · Em .gitignore template, selecione Java
4. Clique em Create repository
5. Clique no botão verde Code e copie a URL HTTPS do repositório
   texto


# 💻 Importação no VSCode ou IntelliJ 

1. Abra seu editor (VSCode ou IntelliJ)
2. Abra a pasta onde deseja clonar o projeto
3. Abra o Terminal do editor
4. Clone o repositório usando a URL copiada:
   bash
   git clone https:/

5. Entre na pasta do projeto:
   bash
   cd PrimeiroCodigoEmJava

# 🌿 Fluxo Básico de Git 

Inicializando o repositório

```
git init
```

Verificando status do repositório

``` 
git status
```

Criando e alternando entre branches

# Criar nova branch

```
git branch nome-da-branch
```

# Alternar para uma branch existente

```
git switch nome-da-branch
```

# Adicionar arquivos ao staging
```
git add .
```

# Criar commit com mensagem

```
git commit -m " Mensagem explicando a alteração"
```

Atualizando e enviando para o GitHub


# Atualizar branch local com remoto
```
git pull origin nome-da-branch
```

# Enviar alterações para o GitHub
```
git push origin nome-da-branch
```

🔄 Mesclar develop para main 

# Mudar para a branch main
```
git checkout main
```

# Mesclar branch de desenvolvimento
```
git merge develop
```


🗑 Apagar branch

# Apagar branch local

```
git branch -d nome-da-branch
```

# Apagar branch remota
```
git push origin --delete nome-da-branch
```

✏ Trocar o nome da branch master para main

# Renomear localmente

```
git branch -m master main
```

# Enviar para o remoto

```
git push -u origin main
```

# Atualizar remoto e remover master antiga

```
git push origin --delete master
```
