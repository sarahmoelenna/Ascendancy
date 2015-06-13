#version 120

varying vec3 varyingColour;
varying vec3 Colour;
varying float Alpha;


void main() {

	vec3 vertexPosition = (gl_ModelViewMatrix * gl_Vertex).xyz;

	vec3 lightDirection = normalize(gl_LightSource[0].position.xyz - vertexPosition);

	vec3 surfaceNormal  = (gl_NormalMatrix * gl_Normal).xyz;

	float diffuseLightIntensity = max(0, dot(surfaceNormal, lightDirection));

	varyingColour.rgb = diffuseLightIntensity * gl_FrontMaterial.diffuse.rgb;
	
	varyingColour += gl_LightModel.ambient.rgb;

	vec3 reflectionDirection = normalize(reflect(-lightDirection, surfaceNormal));

	float specular = max(0.0, dot(surfaceNormal, reflectionDirection));
	if (diffuseLightIntensity != 0) {
	
		float fspecular = pow(specular, gl_FrontMaterial.shininess);
	
		varyingColour.rgb += vec3(fspecular, fspecular, fspecular);
	}
	
	Colour = gl_Color.rgb;
	Alpha = gl_Color.a;
	varyingColour = varyingColour * Colour;

    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
}