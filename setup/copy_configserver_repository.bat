If not exist %HOMEPATH%\configserver\config (
    mkdir %HOMEPATH%\configserver\config
    cd %HOMEPATH%\configserver\config
    git clone git@github.com:GolovchenkoA/OnlineStore-ConfigServer-Configs.git .
) Else (
    echo !!!!Config files should be copied manually because the %HOMEPATH%\configserver folder already exist
)


