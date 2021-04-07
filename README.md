# English
# Hash function
PBKDF2 (Password-Based Key Derivation Function 2) :
- Recommended for passwords
- Hash function with salt
- Then repeat the process several times to produce a hash

Ex : hash = PBKDF2 (password, salt, iteration, bit-len-hash)

# bcrypt

Hash function with salt : function that generates salt and stores it with the hashed password

It is based on Blowfish encryption.

Hash with multiple turns, labor / cost factor :
- Can specify the cost of the hash function
- bcrypt can follow Moore's law

# OAuth and OpenID

OpenID : authentication

OAuth : authorization

Both are open standards.

<h2>OpenID</h2>

Utility :
- Allow users to be authenticated by cooperating sites (trusted parties/RP) using a third-party service
- Way to use a single set of user credentials to access multiple sites
- Users create accounts by selecting an OpenID identity provider and then use those accounts to sign in to any website that accepts OpenID authentication

<h2>OAuth</h2>

Open standard for delegated access :
- Allow websites or apps to access their information on other websites but without giving them passwords
- Access token

OAuth makes it easy to authorize one site's access and use of user account information on another site. It can also be used as a pseudo authentication.

<h2>OpenID Connect</h2>

OpenID Connect : Authentication layer that sits on top of OAuth 2.0

Utility :
- Allow IT clients to verify the identity of an end user based on the authentication performed by a server authorization (Google, GitHub, etc.)
- Allows customers to get basic profile information about the end user

# Français
# Fonction de hachage
PBKDF2 (Password-Based Key Derivation Function 2):
- Recommandé pour les mots de passe
- Fonction de hachage avec salt
- Répète ensuite le processus plusieurs fois pour produire un hachage

Ex :
hash = PBKDF2(password, salt, iteration, bit-len-hash)
# bcrypt

Fonction de hachage avec salt : fonction qui génére du salt et le stocke avec le mot de passe haché

Elle est basée sur le chiffrement Blowfish.

Hash avec plusieurs tours, facteur travail/coût:
- Peut spécifier le coût de la fonction de hachage
- bcrypt peut suivre la loi de Moore

# OAuth and OpenID

OpenID : authentification

OAuth : autorisation

Les deux sont des standards ouverts.

<h2>OpenID</h2>

Utilité :
- Permettre aux utilisateurs d'être authentifiés par des sites coopérants (parties de confiance/RP) utilisant un service tiers
- Moyen d'utiliser un seul ensemble d'informations d'identification utilisateur pour accéder à plusieurs des sites
- Les utilisateurs créent des comptes en sélectionnant un fournisseur d'identité OpenID puis utilisent ces comptes pour se connecter à tout site Web qui accepte l'authentification OpenID

<h2>OAuth</h2>

Standard ouvert pour la délégation d'accès :
- Permettre aux sites Web ou aux applications d'accéder à leurs informations sur d'autres sites Web mais sans leur donner les mots de passe
- Jeton d'accès

OAuth facilite l'autorisation d'accès et d'utilisation d'un site des informations relatives au compte de l'utilisateur sur un autre site. Il peut également être utilisé comme pseudo authentification.

<h2>OpenID Connect</h2>

OpenID Connect: couche d'authentification qui se trouve au-dessus d'OAuth 2.0

Utilité :
- Permettre aux clients informatiques de vérifier l'identité d'un utilisateur final basé sur l'authentification effectuée par une autorisation serveur (Google, GitHub, …)
- Permet aux clients d'obtenir les informations de profil de base sur l’utilisateur final
