//
//  .swift
//  SpaceTrader
//
//  Created by Thomas Suarez on 4/20/19.
//  Copyright © 2019 RajsJarFiles. All rights reserved.
//

import Foundation

protocol TransactionValidator {
    
    func validate(to : TransactionOrder) -> Bool
    
}
