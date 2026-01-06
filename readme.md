# alg-java

## vscode config

```json
{
    "redhat.telemetry.enabled": false,
    "java.dependency.packagePresentation": "hierarchical",
    "java.configuration.updateBuildConfiguration": "automatic",
    "java.project.explorer.showNonJavaResources": false,
    "java.saveActions.organizeImports": true
}
```

## devcontainer config

```json
{
    "remoteUser": "chen",
    "remoteEnv": {
        "TZ": "Asia/Shanghai",
        "Lang": "C.UTF-8"
    },
    "build": {
        "dockerfile": "Dockerfile"
    },
    "customizations": {
        "vscode": {
            "extensions": [
                "vscjava.vscode-java-pack",
                "tamasfe.even-better-toml"
            ]
        }
    }
}
```

```dockerfile
FROM docker.1ms.run/library/fedora:43
RUN sed -i \
        -e 's|^metalink=|#metalink=|g' \
        -e 's|^#baseurl=http://download.example/pub/fedora/linux|baseurl=https://mirrors.tuna.tsinghua.edu.cn/fedora|g' \
        /etc/yum.repos.d/fedora.repo /etc/yum.repos.d/fedora-updates.repo && \
    dnf -y upgrade && \
    dnf -y install git curl zip unzip && \
    groupadd -g 1000 chen && \
    useradd -m -s /bin/bash -u 1000 -g 1000 chen
WORKDIR /home/chen
COPY init.sh .
RUN chown 1000:1000 init.sh && \
    chmod 754 init.sh
USER chen
RUN ./init.sh
```

```shell
#!/bin/bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 25.0.1-tem
rm -f init.sh
```