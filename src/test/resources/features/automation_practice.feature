Feature: Buy the dresses in the store
  i as user of the ecommerce
  want to buy a summer dress
  then add it to the cart

@BuySummerDress
  Scenario Outline:: Buy clothes online
    Given the user opens a ecommerce site
    When the user is selecting the <clothing>
    Then he can select the clothing with lowest priced
    Examples: :
    | clothing |
    | summer dress|
