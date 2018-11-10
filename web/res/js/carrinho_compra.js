function limitar(campo){
				str = campo.value;
				if(str.length > 2){
				 campo.value = str.substring(0,str.length - 1);
				}
			}
function limatacep(cep){
				str = cep.value;
				if(str.length > 7){
				 cep.value = str.substring(0,str.length - 1);
				}
			}
function validarcampo(evt){
			 var key_code = evt.keyCode;
				if((key_code  >= 48) && (key_code <= 57)){
				 return true;
				}
				 return false;
			}