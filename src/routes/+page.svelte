<script>

	import Hijo from '$lib/Hijo.svelte'
	
	export let data; 
	
	export let nombre; 

	let contador =0;
	function incrementar(){
		contador = contador + 1;
	}
	
	function saludar() {
 	alert(nombre ? nombre : "valor nulo");
	}
</script>

<main>
	<h1>Pajaro {data.name}!</h1>

	<h1>Contar: {contador}</h1>
	<button on:click={incrementar}>Contar++</button>
	
	<Hijo texto="Guardar" color='green'></Hijo>
	<Hijo texto="Borrar" color='red'></Hijo>
	
	<button on:click={saludar} >Saludarme</button>
	<input bind:value={nombre} placeholder="Escribe tu nombre">
	<p>Hola {nombre}</p>
	<p>Visita <a href="https://kit.svelte.dev">kit.svelte.dev</a> para aprender SvelteKit.</p>
</main>

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}

	h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	}

	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>