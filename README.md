# Deli's DELI-cious Deli Sandwiches
The user of this application will be able to utilize its functions in order to allow their customers to customize their sandwich orders.

## Home Screen

#### The Home Screen is where users are greeted and prompted to:
- Make a new Order
- Exit the application

><details>
><summary> Home Screen </summary>
>
> ![HomeScreen](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/HomeScreen.PNG)
></details>

## New Order Screen

#### The New Order Screen is where users are prompted to:

- Add a sandwich
- Add a drink
- Add chips
- Add sides
- Checkout their order
- Cancel their order

><details>
><summary> Creating a New Order </summary>
>
>![NewOrder](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/NewOrderScreen.PNG)
></details>

## Add Sandwich Screen

#### The Add Sandwich Screen is where user is able to create and fully customize their sandwich. They will be prompted to:
- Select the bread size
- Select the bread type
- Add any regular toppings with no additional cost
- Add any premium toppings at an additional cost
- Select a cheese to add to their sandwich
- Select any sauces to add to their sandwich
- Add any extra premium toppings, extra cheese, or toast their sandwich before finalizing their sandwich customization
- Cancel sandwich creation

Afterwards, the user is given a confirmation message ensuring that their sandwich was successfully created and added to their order.

><details>
><summary> Creating a Sandwich Screen </summary>
>
>![SandwichScreen](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/SandwichScreen.PNG)
></details>


## Add Drink Screen

#### The Add Drink Screen is where the user is able to:
- Select one of several available drink flavors
- Select the size of their drink, ranging from Small, Medium, or Large options

Afterwards, the user is given a confirmation message ensuring that their drink was successfully added to their order.

><details>
><summary> Adding a Drink Screen </summary>
>
>![DrinkScreen](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/DrinkScreen.PNG)
></details>

## Add Chips Screen

#### The Add Chips Screen is where the user is able to select from several available chip options currently in stock.

Afterwards, the user is displayed a confirmation message that their selected chips were successfully added to their order.

><details>
><summary> Adding Chips Screen </summary>
>
>![ChipsScreen](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/ChipsScreen.PNG)
></details>

## Add Sides Screen

#### The Add Sides Screen is where the user is able to select from two available sides options.

Afterwards, they will be shown a confirmation message ensuring that their sides option was successfully added to their order.

><details>
><summary> Adding Sides Screen </summary>
>
>![SidesScreen](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/SidesScreen.PNG)
></details>

## Approach

><details>
><summary> Initial Diagram </summary>
>
>![OrigDiagram](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/OrigDiagram.PNG)
></details>

><details>
><summary> Modified Diagram </summary>
>
>![NewDiagram](https://github.com/alyu15/CapstoneTwo_Deli/blob/3fd37416b884ff9e8553ad2834f7a82a421c6775/Images/NewDiagram.PNG)
></details>

## Interesting Piece of Code

```
StringBuilder builder = new StringBuilder();

        builder.append("\nOrder")
                .append("\n==========================================\n")
                .append("==========================================\n")
                .append(connect(sandwiches))
                .append("==========================================\n")
                .append(connect(drinks))
                .append("==========================================\n")
                .append(connect(chips))
                .append("==========================================\n")
                .append(connect(sides));

        return builder.toString();
    }

    private String connect(List<?> list) {
        StringBuilder listBuilder = new StringBuilder();
        for (Object item : list) {
            listBuilder.append(item).append("\n");
        }
        return listBuilder.toString();
    }
```
I found this piece of code interesting because I had always just auto-generated the properties of a class and left them as that.
Instead, I would normally println after each bit of code but I found that by using these methods, I'm able to save some time and not
have to manually try and make things look pretty each and every time I go to println.

<br>
<div align="center">
<b>Thank you for taking the time out to check out my application!</b>

![Closing](https://github.com/alyu15/WorkshopFive_CarDealershipPart2/blob/7f801e60c66e603f04c420eab3f73f97b2115b9f/Images/Closing.PNG)  
</div>


