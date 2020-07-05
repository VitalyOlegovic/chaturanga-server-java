# chaturanga-server-java
A SpringBoot GraphQL server for chaturanga

## Insert game

    mutation{createChessGame(
      id:1003
      playerWhite:"Mario"
      playerBlack:"Luigi"
      startDate: "2020-01-01"
    ) {
      id
      playerWhite
      playerBlack
    }}

## See games

    {games{
      id
      startDate
    }}