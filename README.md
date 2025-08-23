# 🚀 Meu Primeiro Código em Java

Olá! Esse é o meu primeiro código em **Java**.  
O meu começo nessa linguagem foi no dia **22/08/2025**.  
Aqui irei postar tudo dos meus primeiros passos nessa linguagem.

---

# ⚙️ Configuração inicial do Git

🔧 Configure seu nome e e-mail no Git:
```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```



# 🌿 Trabalhando com branches (ramificações)

Verifique em qual branch está:


```
git branch
```


Crie uma nova branch:

```
git branch nome-da-branch
```

Troque para uma branch existente:

```
git switch nome-da-branch
```

# 📝 Salvando alterações

Sempre veja o status do repositório:

```
git status
```

Adicione todas as mudanças para a área de stage:

```
git add .
```

Crie um commit com uma mensagem:

```
git commit -m "Mensagem explicando a alteração"
```

# 🔄 Sincronizando branches

Se quiser unir o que foi feito na branch develop para a branch main, use:

```
git checkout main
git merge develop
```

# 🚀 Enviando para o GitHub

Depois de commitar, envie sua branch para o GitHub:

```
git push origin nome-da-branch
```

# Exemplo, para enviar a branch develop:

```
git push origin develop

```

Depois disso, confira com:

```
git status
```


# ** E atualize a página do repositório no GitHub para confirmar.**