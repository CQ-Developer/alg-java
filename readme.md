# alg-java

## vscode config

```json
{
    "redhat.telemetry.enabled": false,
    "java.dependency.packagePresentation": "hierarchical",
    "java.configuration.updateBuildConfiguration": "automatic",
    "java.project.explorer.showNonJavaResources": false,
    "java.saveActions.organizeImports": true,
    "java.import.gradle.java.home": "/usr/lib/jvm/msopenjdk-current"
}
```

## devcontainer config

```json
{
    "name": "alg-java-dev-container",
    "image": "mcr.microsoft.com/devcontainers/java:25",
    "features": {
        "ghcr.io/devcontainers/features/common-utils:2": {
            "upgradlePackages": true,
            "installZsh": false,
            "installOhMyZsh": false,
            "installOhMyZshConfig": false
        }
    },
    "customizations": {
        "vscode": {
            "extensions": [
                "tamasfe.even-better-toml"
            ]
        }
    }
}
```