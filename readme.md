# alg-java

## vscode config

```json
{
    "redhat.telemetry.enabled": false,
    "java.saveActions.organizeImports": true,
    "java.dependency.packagePresentation": "hierarchical",
    "java.configuration.updateBuildConfiguration": "automatic",
    "java.project.explorer.showNonJavaResources": false,
    "java.maven.downloadSources": true,
    "maven.view": "hierarchical"
}
```

## devcontainer config

```json
{
    "name": "alg-java-dev-container",
    "image": "mcr.microsoft.com/devcontainers/base:ubuntu",
    "features": {
        "ghcr.io/devcontainers/features/java:1": {
            "version": "25",
            "jdkDistro": "open",
            "installMaven": true,
            "mavenVersion": "3.9.11"
        },
        "ghcr.io/devcontainers/features/common-utils:2": {
            "upgradlePackages": true,
            "installZsh": false,
            "installOhMyZsh": false,
            "installOhMyZshConfig": false
        }
    }
}
```