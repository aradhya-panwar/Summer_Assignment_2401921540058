class LC_121_Buy_Sell:
    def maxProfit(self, prices: List[int]) -> int:
        
        highest_profit = 0
        Min = prices[0]
        for current_price in prices:
            #First we gotta buy
            #aintain the best profit seen while scanning
            Min = min(current_price,Min)
            current_profit = current_price - Min
            highest_profit = max(highest_profit,current_profit)
        return highest_profit

