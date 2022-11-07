# read-transactions-batch

This project makes use of Azure App Configuration to get settings including secrets through Key Vault

## Installation

Use the package manager maven to install azure-app-configuration.

```bash
mvn install
```

## Environment variables

```
AZURE_CLIENT_ID=
AZURE_CLIENT_SECRET=
AZURE_TENANT_ID=
APP_CONFIGURATION_ENDPOINT=
```

## Additional Information
I used Azure Key Vault to store the database secrets.

My key vault contains database-password and database-user properties