If not exist %HOMEPATH%\configserver\config (
    SET script_location=%cd%
    xcopy /E/I configserver\config %HOMEPATH%\configserver\config
    cd %HOMEPATH%\configserver\config
    git init .
    git add -A .
    git commit -m "init configuration"
) Else (
    echo !!!!config files were not copied because the %HOMEPATH%\configserver folder already exist
)


