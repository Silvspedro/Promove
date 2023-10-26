/**
 * Validação de formulario
 * @author Pedro Alves
 */
function validarForm() {
	var nome = document.forms["formCadastro"]["nome"].value;
	var email = document.forms["formCadastro"]["email"].value;
	var senha = document.forms["formCadastro"]["senha"].value;
	
	var nomeError = document.getElementById("nomeError");
	var emailError = document.getElementById("emailError");
	var senhaError = document.getElementById("senhaError");

	nomeError.innerHTML = "";
	emailError.innerHTML = "";
	senhaError.innerHTML = "";

	var isValid = true;

	if (nome === "") {
		nomeError.innerHTML = "Nome é obrigatório";
		isValid = false;
	}

	if (email === "") {
		emailError.innerHTML = "Email é obrigatório";
		isValid = false;
	}

	if (senha === "") {
		senhaError.innerHTML = "Senha é obrigatória";
		isValid = false;
	}

	return isValid;
}
let count = 1;
document.getElementById("radio1").checked = true;

setInterval(function() {
	nextImage();
}, 4000)

function confereSenha() {
	const senha = document.querySelector('input[name=senha]');
	const confirSenha = document.querySelector('input[name=confirSenha]');
	
	if (confirSenha.value === senha.value){
		confereSenha.setCustomValidity('');
	} else{
		confereSenha.setCustomValidity('As senhas não conferem ');
	}
}

function nextImage() {
	count++;
	if (count > 4) {
		count = 1;
	}

	document.getElementById("radio" + count).checked = true;
}


const modal = document.querySelector('.modal-container')

function openModal() {
	modal.classList.add('active')
}

function closeModal() {
	modal.classList.remove('active')
}


