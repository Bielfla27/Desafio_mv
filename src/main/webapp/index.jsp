<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Café da Manha MV</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
		<link rel="stylesheet" href="css/styler.css" />
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
	</head>
	<body >  
	
		<form action="serveletCafe" method="post" onsubmit="return validarDados()" >
		
	        
	        <div class="form-group">
	            <label for="nome">Nome:</label>
	            <input class="form-control" type="text" id="nome" name="nome" placeholder="Ex: Gabriel Felix">
	            
	            <label for="cpf">CPF:</label>
	            <input class="form-control" type="text" id="cpf" name="cpf" placeholder="Ex: 123.456.789.10">
	            
	            <label for="cafe">Comida ou Bebida:</label>
	            <input class="form-control" type="text" id="comida" name="comida" placeholder="Digite o que vai levar para o café">
	            
	            <button class="btn btn-primary" id="butao" type="submit" value="Submit" >Enviar</button>
	            
	  			
	        </div>
	       
	        
	     </form>
	     
	     <script type="text/javascript">
				function validarDados() {
					var nome = document.getElementById("nome").value;	
					var cpf = document.getElementById("cpf").value;	
					var comida = document.getElementById("comida").value;	
			
					if(nome == ''){
						alert('Informe o nome');
						return false;
					}else if(cpf == ''){
						alert('Informe o cpf');
						return false;
					}else if(comida == ''){
						alert('Informe a comida que vai levar');
						return false;
					}
				}
			
			</script>
		
	</body>
</html>